﻿using System;
namespace HSim
{
    public class Player
    {
        string name;
        public int[,] userData = new int[2, 95];
        public int score;

        public Player(string name)
        {
            this.name = name;
            for (int i = 0; i < 95; i++)
            {
                this.userData[0, i] = 32 + i;
            }
        }
    }
}