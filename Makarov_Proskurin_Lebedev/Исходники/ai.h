#pragma once

#ifndef AI_H
#define AI_H

#include "object.h"
#include "team.h"

////////////////////////////////////////////////////////////////////////////////
/// \brief Искусственный интеллект - набор правил и действий, направленных на добычу
/// ресурсов, защиту собственной базы и атаки на врага.
class AI : public Object
{
	private:
		/// Указатель на команду AI
		Team *TeamAI = NULL;
	public:
		/// @name Конструкторы
		/// @{
		AI();
		AI(IDTeam IDTEAM);
		/// @}

		/// @name Деструкторы
		/// @{
		virtual	~AI();
		/// @}
};

#endif // AI_H
////////////////////////////////////////////////////////////////////////////////
